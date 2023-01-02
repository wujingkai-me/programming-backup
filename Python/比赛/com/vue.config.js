const { defineConfig } = require('@vue/cli-service')
module.exports = defineConfig({
  transpileDependencies: true,
  lintOnSave:false,
  // eslint: false,
  devServer: {
    proxy: {
      '/api': {
        target: 'http://localhost:8088/',
        changeOrigin: true,
        pathRewrite: {
          "/api": ""
        },
        ws: true
      },
      // "ws": false
    }
  }
})
