<template>
  <div id="counter">Counter: {{ counter }}</div>
</template>
<script>
export default {
  name: "HelloWorld",
  data() {
    return {
      counter: 1,
    };
  },
  mounted() {
    setInterval(() => {
      this.counter++;
    }, 1000);
  },
};
</script>

<style>
</style>