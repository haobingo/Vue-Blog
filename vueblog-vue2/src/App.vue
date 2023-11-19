<template>
  <div id="app">
    <router-view/>
  </div>
</template>

<style>
#app {
  max-width: 960px;
  margin: 0 auto;
}

.markdown-body,.markdown-body .highlight pre, .markdown-body pre {
  background-color:white !important;
  color:black !important;
}

.auto-textarea-wrapper .auto-textarea-input{
  background-color: white !important;
  color: black !important;
}

a{
  text-decoration: none !important;
}
</style>
