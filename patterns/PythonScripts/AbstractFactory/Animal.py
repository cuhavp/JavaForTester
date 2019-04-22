class Animal :
    __sound = ""
    def __init__(self, sound):
        self.__sound = sound

    def speak(self):
        print(self.__sound)


class Dog(Animal):
    def __init__(self):
        return Animal("Gau Gau")  

class Cat(Animal):
    def __init__(self):
        Animal("Meo Meo") 

class Lion(Animal):
    def __init__(self):
        return Animal("Goar")

class Shark(Animal):
    def __init__(self):
       return Animal("Phap Phap")

class Octopus(Animal):
    def __init__(self):
        return Animal("") 

# Abstract Factory Classes
class AnimalFactory :
    def getAnimal(self,name):
        if('dog'.equals(name)) :
            return Dog()
        

