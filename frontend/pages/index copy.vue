<script>
function start() {
  if (flag == 1) {
    time += 1000;
    console.log("flag", flag);
  }
  show();
  setTimeout("start()", 100);
}

function full(n) {
  n = parseInt(n);
  if (n < 10) {
    return "0" + n;
  } else {
    return n;
  }
}

function show() {
  let s = full(((time * 100) / 1000) % 60);
  let m = full(((time * 100) / 1000 / 60) % 60);
  let h = full((time * 100) / 1000 / 60 / 60);
  document.getElementById("time").innerText = h + ":" + m + ":" + s;
  // console.log(s + " " + m);
}
export default {
  data() {
    return {
      flag: 0,
      time: 0,
    };
  },
};
</script>

<template>
  <div class="app">
    <div class="nav">
      <h1>Timer</h1>
      <span>v0.001</span>
    </div>

    <div class="timer">
      <div>{{ nowTime }}</div>
    </div>

    <div onload="start()" class="timeGroup">
      <div id="timeCon">00:00:00</div>
      <button id="start" @click="flag = 1">开始</button>
      <button id="pause" @click="flag = 0">暂停</button>
      <button
        id="end"
        @click="
          flag = 0;
          time = 0;
        "
      >
        结束
      </button>
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



