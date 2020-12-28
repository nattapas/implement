#!/usr/bin/python3

# ป้องกันตัวแปร ไม่ให้เข้าถึงได้โดยตรงจากภายนอก ให้แก้ไขและเข้าถึงได้ผ่าน Method เท่านั้น
class Encapsulation:
    __invisible = ""
    visible = ""

    def __init__(self, foo, bar):
        self.__invisible = foo
        self.visible = bar

    def getInvisible(self):
        return self.__invisible

    def setInvisible(self, foo):
        self.__invisible = foo


encapsulation = Encapsulation("You can't see me.", "You can see me.")

# get and set value directly
# print(encapsulation.visible)
# encapsulation.visible = "You can see my new value." # set new value to invisible
# print(encapsulation.visible)

# can't get value directly
# print(encapsulation.__invisible)
# try:
#     print(encapsulation.__invisible)
# except Exception as e:
#     print(e)

# can't set value directly
# encapsulation.__invisible = "You also can't set me."
# print(encapsulation.getInvisible())

# must use getter and setter method
encapsulation.setInvisible("You can set me now.")
print(encapsulation.getInvisible())
