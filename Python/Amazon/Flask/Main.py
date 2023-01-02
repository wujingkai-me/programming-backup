import json
import Amazon
from flask import Flask
from flask import render_template
app = Flask(__name__)


@app.route("/")
def root():
    return render_template("html/index.html")


@app.route("/English")
def English():
    return render_template("html/EnglishRemove.html")


@app.route("/Format")
def Format():
    return render_template("html/Format.html")


@app.route("/getkeyword/<keyword>/<countryName>", methods=["get"])
@app.route("/getkeyword")
def getKeyword(keyword="", countryName="AMAZON_CO_UK"):
    if keyword == "":
        return ["Keyword Error!"]
    return Amazon.returnKeywordList(countryName, keyword)


@app.route("/Download/<data>", methods=["get"])
def Download(data):
    data = json.loads(data)
    for i in data:
        print(data)

    return ""


if __name__ == "__main__":
    app.run(debug=True)
