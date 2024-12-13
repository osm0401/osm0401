from time import sleep

from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.edge.options import Options
import time
import random

options = Options()
options.add_argument("--headless")
options.add_argument("--disable-gpu")
options.add_argument("--window-size=1920,1080")

driver = webdriver.Edge(options=options)

a = "1234567890qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM"
ass = "https://discord.com/gifts/"

for _ in range(10000):
    q = "".join(random.choice(a) for _ in range(16))
    qw = ass + q

    try:
        driver.get(qw)
        sleep(1)
        try:
            element = driver.find_element(By.CSS_SELECTOR, ".text-md\\2f normal_dc00ef")
            if element.text == "선물 코드가 만료되었거나 잘못 입력하신 거 같아요.":
                print(f"Code expired or invalid: {q}")
            else:
                print(f"succes : P{q}")
                exit()
        except Exception:
            print(f"Element not found for code: {q}")
    except Exception as e:
        print(f"Error navigating to {qw}: {e}")

driver.quit()
