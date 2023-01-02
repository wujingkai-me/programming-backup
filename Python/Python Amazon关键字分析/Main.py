# encoding: utf-8
import io, sys
import flask, requests, re

from flask import request as flask_rq
from flask_cors import CORS

sys.stdout = io.TextIOWrapper(sys.stdout.buffer,encoding='utf8') #改变标准输出的默认编码

app = flask.Flask(__name__)
CORS(app, supports_credentials=True)



class request:
       
    @staticmethod
    def Request(url):
        class hasText():
            def __init__(self) -> None:
                self.text = ""
                self.title = ""
        
        header = {
            "User-Agent": "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/106.0.0.0 Safari/537.36 Edg/106.0.1370.52"
        }
        try:
            rq = requests.get(url, headers=header)
            rq.encoding = "utf-8"
            rq.raise_for_status()
            return rq
        except Exception as e:
            print(e)
            return hasText()
    
    @staticmethod
    def regex_keyword(text):
        keyword = list()
        res = re.findall(r"class=\"keywords\".*?>.*?a>", text.replace("\n", ""))
        for r in res:
            r_ = re.findall(r"_blank.*<", r)
            if r_ != None:
                result = r_[0][8: -1]
                keyword.append(result)
        
        return keyword
            
            
@app.route("/datasets/", methods=["GET"])
def root():
    url = flask_rq.args.get("url_")

    rq = request.Request(url)
    result = request.regex_keyword(rq.text)
    return result

app.run(port=1000)