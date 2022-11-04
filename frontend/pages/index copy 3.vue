<template>
  <div class="">
    <h4 id="mytime">{{ str }}</h4>
    <button id="start" name="button" @click="start">开始计时</button>
    <button id="stop" name="button" @click="stop">暂停计时</button>
    <button id="reset" name="button" @click="reset">重置</button>
  </div>
</template>

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