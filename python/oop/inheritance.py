#!/usr/bin/python3

# สืบทอด attributes และ methods จาก parent class โดยสามารถเพิ่มได้
class ParentA:
    parentAAttr = 100

    def __init__(self):
        print("Calling parent A constructor")

    def parentAMethod(self):
        print("Calling parent A method")

    def setAttrA(self, attr):
        self.parentAttr = attr

    def getAttrA(self):
        print("Parent A attribute :", self.parentAttr)


class ParentB:
    parentBAttr = 100

    def __init__(self):
        print("Calling parent B constructor")

    def parentBMethod(self):
        print("Calling parent B method")

    def setAttrB(self, attr):
        self.parentAttr = attr

    def getAttrB(self):
        print("Parent B attribute :", self.parentAttr)


class Child(ParentA, ParentB):
    def __init__(self):
        print("Calling child constructor")

    def childMethod(self):
        print("Calling child method")


c = Child()
# c.childMethod()

# call ParentA
c.parentAMethod()  # can call method from Parent class because inheritance
c.setAttrA(200)
c.getAttrA()

# # call ParentB
c.parentBMethod()  # can call method from Parent class because inheritance
c.setAttrB(200)
c.getAttrB()
