<template>
  <div>
    <!-- <h2>各省份消费能力</h2> -->
    <div id="bar"></div>

    <!-- <h2>每年上架商品数量的变化</h2> -->
    <div id="line"></div>
  </div>
</template>

<script>
import axios from "axios";
import echarts from "echarts";

export default {
  name: "HelloWorld",
  methods: {
    drawPictureBar(data){
      let option = {
        title: {
          text: '各省份消费能力',
          subtext: '',
          left: 'center'
        },
        tooltip: {
          trigger: 'item'
        },
        legend: {
          orient: 'vertical',
          left: 'left'
        },
        series: [
          {
            name: 'Access From',
            type: 'pie',
            radius: '50%',
            // data: [
            //   { value: 1048, name: 'Search Engine' },
            //   { value: 735, name: 'Direct' },
            //   { value: 580, name: 'Email' },
            //   { value: 484, name: 'Union Ads' },
            //   { value: 300, name: 'Video Ads' }
            // ],
            data,
            emphasis: {
              itemStyle: {
                shadowBlur: 10,
                shadowOffsetX: 0,
                shadowColor: 'rgba(0, 0, 0, 0.5)'
              }
            }
          }
        ]
      };
      // console.log(echarts)
      echarts.init(document.querySelector("#bar")).setOption(option)
    },
    drawPictureLine(name, data){
      let option = {
        title: {
          text: "每年上架商品数量的变化",
          left: "center"
        },
        xAxis: {
          type: 'category',
          data: name
        },
        yAxis: {
          type: 'value'
        },
        series: [
          {
            data: data,
            type: 'line',
            smooth: true
          }
        ]
      };

      echarts.init(document.querySelector("#line")).setOption(option);
    }
  },
  mounted() {
    axios.get("/api/visual/queryProvinceExpenditure")
      .then(res => {
        let datas = res.data.records
        let data = []
        for(let item of datas){
          data.push({ "name": item.provinceName, "value": item.expenditure })
        }

        this.drawPictureBar(data)
      });
    
    axios.get("/api/visual/queryGoodsCount")
      .then(res => {
        let datas = res.data.goodsCounts
        // console.log(datas)
        let name = [], _data = [];
        for(let data of datas){
          name.push(data.year)
          _data.push(data.count)
        }

        this.drawPictureLine(name, _data);
      })
  }
}

</script>
<style scoped>

  #bar {
    width: 600px;
    height: 600px;
    margin: 0 auto;
    float: left;
  }

  #line {
    width: 800px;
    height: 600px;
    float: left;
  }
</style>