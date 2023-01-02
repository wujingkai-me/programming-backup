import React from "react";
import "./css/index.css";
import ShanxiMap from "../demo5";
import Weather from "../demo2";
import AirQuality from "../AirQuality";
import WeatherInfo from "../WeatherInfo";
import axios from "axios";

export default class ViewBigData extends React.Component {
  state = {
    lastUpdateTime: null
  }

  componentDidMount = () => {
    this.axiosAllData("太原")
  }

  // 请求所有的数据
  axiosAllData = (cityName) => {
    axios.get("https://www.tianqiapi.com/api", {
      params: {
        appid:23035354,
        appsecret:"8YvlPNrz",
        version:"v9",
        cityid:0,
        city: cityName,
        ip:0,
        callback:0
      }
    }).then((response) => {
      let lastUpdateTime = response.data.update_time
      this.setState({
        lastUpdateTime: lastUpdateTime
      })

      console.log(this.state)
    }).catch((error) => {
      console.log(error)
    })
  }


  ShanxiMapOnClick = (cityName) => {
    // console.dir(this)
    this.AirQualityComponent.current.changeCityName(cityName)
    this.WeatherComponent.current.getWeatherInfo(cityName)
    // this.AirQualityCityName = cityName
  }
  render() {
    this.AirQualityComponent = React.createRef();
    this.WeatherComponent = React.createRef();
    return (
      <div>
        <div className="divTop">
          更新时间 { this.state.lastUpdateTime }
        </div>
        <div className="Container">
          <div className="sideleft">
            {/* <h2>温度</h2> */}
            <Weather ref={this.WeatherComponent}></Weather>
          </div>
          <div className="sidebottom">
            <h2>天气情况</h2>
            <WeatherInfo></WeatherInfo>
          </div>
          <div className="mid">
            <h2>山西地图</h2>
            <ShanxiMap change={this.ShanxiMapOnClick}></ShanxiMap>
          </div>
          <div className="sideright">
            <h2>空气质量</h2>
            <AirQuality ref={this.AirQualityComponent}></AirQuality>
          </div>
          <div className="siderightbottom">
            <h2>自定义</h2>
          </div>
        </div>
      </div>
      
    );
  }
}