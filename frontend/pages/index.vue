<script>
export default {
  data() {
    return {
      h: 0, //定义时，分，秒，毫秒并初始化为0；
      m: 0,
      s: 0,
      ms: 0,
      time: 0, //定时器
      str: "00:00:00",
      times: "", //统计共多少秒时间
    };
  },
  methods: {
    start() {
      //开始
      this.time = setInterval(this.timer, 50);
    },

    stop() {
      //暂停
      clearInterval(this.time);
    },
    reset() {
      //重置
      clearInterval(this.time);
      this.h = 0;
      this.m = 0;
      this.ms = 0;
      this.s = 0;
      this.str = "00:00:00";
    },
    timer() {
      //定义计时函数
      this.ms = this.ms + 50; //毫秒
      if (this.ms >= 1000) {
        this.ms = 0;
        this.s = this.s + 1; //秒
      }
      if (this.s >= 60) {
        this.s = 0;
        this.m = this.m + 1; //分钟
      }
      if (this.m >= 60) {
        this.m = 0;
        this.h = this.h + 1; //小时
      }
      this.str =
        this.toDub(this.h) +
        ":" +
        this.toDub(this.m) +
        ":" +
        this.toDub(this.s);
      //统计共看了多少秒
      this.times = this.s + this.m * 60 + this.h * 3600;
    },
    toDub(n) {
      //补0操作
      if (n < 10) {
        return "0" + n;
      } else {
        return "" + n;
      }
    },
  },
};
</script>

<template>
  <div class="app">
    <div class="nav">
      <h1>Timer</h1>
      <span>v0.001</span>
    </div>

    <div class="timeGroup">
      <div id="timeCon">{{ str }}</div>
      <button id="start" @click="start">开始计时</button>
      <button id="stop" @click="stop">暂停计时</button>
      <button id="reset" @click="reset">重置</button>
    </div>

    <div class="btnGroup">
      <div class="icon"></div>
      <div class="tit">开始</div>
    </div>
  </div>
</template>




<style lang="less" scoped>
@import url("https://fonts.googleapis.com/css2?family=Inter:wght@300&display=swap");
@import url("https://fonts.googleapis.com/css2?family=Inter:wght@800&display=swap");

@font-face {
  font-family: "D-DIN";
  src: url("/font/D-DIN.otf");
}
@font-face {
  font-family: "D-DIN-Bold";
  src: url("/font/D-DIN-Bold.otf");
}
.app {
  display: flex;
  flex-direction: column;
  align-items: center;
  gap: 3rem;
  .btnGroup {
    padding: 10rem;
    background-color: #0073ff;
    border-radius: 3rem;
    position: relative;
    .icon {
    }
    .tit {
      font-size: 2rem;
      bottom: 2rem;
      right: 2rem;
      position: absolute;
      color: #fff;
    }
  }
}
.nav {
  width: 100vw;
  padding-top: 10rem;
  display: flex;
  align-items: center;
  justify-content: center;
  gap: 1rem;

  h1 {
    color: #0073ff;
    font-family: "D-DIN";
    font-size: 3rem;
    line-height: 1;
    letter-spacing: 1px;
  }
  span {
    font-family: "D-DIN";

    color: #000;
    line-height: 1;
    font-size: 2rem;
  }
}

.timeGroup {
  #timeCon {
    font-family: "D-DIN-Bold";
    font-size: 12rem;
  }
}
</style>



