import requests
import re
import threading


class MacWallpaper:

    # 请求异常类
    class ErrorMacWallpaper:
        def __init__(self, text) -> None:
            self.text = text

    def __init__(self) -> None:
        self.BASE_URL = "https://www.macapp.so/wallpaper/"
        self.regexToImg = r"https://wallpaper.torrentsky.com/d/.*?png|https://wallpaper.torrentsky.com/d/.*?jpg"

        self.__HEADERS = {
            "user-agent": "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/106.0.0.0 Safari/537.36 Edg/106.0.1370.52"
        }

    # 网络请求 返回网络请求对象
    def request(self, url=""):
        # 判断url是否为空
        if (url == "") or (url == None):
            return self.ErrorMacWallpaper("URL 是空的")

        # 进行网络请求
        try:
            req = requests.get(url=url, headers=self.__HEADERS)
            requests.status_codes = "utf-8"
        except Exception as e:
            return self.ErrorMacWallpaper(str(e))

        return req

    # 获得指定格式的网址连接
    def generateGetMacPageUrl(self, start, end) -> list:
        pages = list()
        if start == 1:
            pages.append("{}index.html".format(self.BASE_URL))
            start += 1

        for page in range(start, end + 1):
            pages.append("{}index_{}.html".format(self.BASE_URL, page))

        return pages

    # 获得 网页中的所有图片连接
    def regexContext(self, response):
        text = response.text
        imgUrls = re.findall(self.regexToImg, text)
        return imgUrls

    def saveImages(self, imgBinary, savePath):
        with open(savePath, "wb") as File:
            File.write(imgBinary.content)
            File.close()

        print("Save That is OK!")

    def getImgUrlName(self, imgUrl):
        position = imgUrl.rfind("/") + 1
        return imgUrl[position:]

    def main(self, pageUrls):
        for page in pageUrls:
            print("第{}页".format(page))
            response = macWallpaper.request(page)
            imgUrls = macWallpaper.regexContext(response)

            for imgUrl in imgUrls:
                responseImg = macWallpaper.request(imgUrl)
                imgUrl = macWallpaper.getImgUrlName(imgUrl)

                macWallpaper.saveImages(responseImg, imgUrl)


if __name__ == "__main__":
    macWallpaper = MacWallpaper()
    l = [i for i in range(1, 80, 5)]
    print(macWallpaper.generateGetMacPageUrl(1, 10))
    for i in l:
        # pageUrls = macWallpaper.generateGetMacPageUrl(i, i + 5)
        threading.Thread(target=macWallpaper.main, args=(
            macWallpaper.generateGetMacPageUrl(i, i + 5),)).start()