import time
import openai
import requests
from bs4 import BeautifulSoup
openai.api_key = ""

messages = []
for i in range(1,10):
    k = "https://codeup.kr/problem.php?id="
    num = 6063
    a = requests.get(k + str(num+i))
    kk = BeautifulSoup(a.content, 'html.parser')
    found = kk.find(id="pro1")
    #user_content = input("user : ")
    messages.append({"role": "user", "content": f"{str(found)+"python정답코드만짜줘"}"})
    completion = openai.ChatCompletion.create(model="gpt-4o", messages=messages)
    assistant_content = completion.choices[0].message["content"].strip()
    messages.append({"role": "assistant", "content": f"{assistant_content}"})
    print(f"GPT : {assistant_content}")
    print(a)
    print()
    print()
    print()
    time.sleep(2)
#a
