#!/usr/bin/python3

# Overriding parent method เพราะอยากได้ฟังก์ชั่นทำงานต่างออกไปใน subclass
class Parent:
    # method นี้จะไม่ถูกเรียกใช้จาก subclass
    def myMethod(self):
        print("Calling parent method")


class Child(Parent):
    def myMethod(self):
        print("Calling child method")


c = Child()
c.myMethod()  # มี method ชื่อเหมือนกัน แต่จะเรียกใช้ mehod ของ child
