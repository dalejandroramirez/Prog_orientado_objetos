
class Account:
    id          = int
    name        = str
    document    = str
    email       = str
    password    = str

    def __init__(self, name, document):
        self.name       = name
        self.document   = document
    def Crear_Usuario(self,name,document,password):
        self.id
        self.name=name
        self.document=document
        self.password=password

class User(Account):
    def __init__(self, name, document):
        super().__init__(name,document)


Alejandro=User("alejandro","12345")
Daniel=User("Daniel","12345")
Alejandro.id=12
Alejandro.Crear_Usuario("Andres","1234","clave")

print(Alejandro.name)
print(Daniel.name)
print(Alejandro.id)
print(Daniel.id)


class Car:
    id          = int
    license     = str
    driver      = Account("","")
    passegenger = int

    def __init__(self, license, driver):
        self.license    = license
        self.driver     = driver

class Route:
    id=int
    start=[]
    end=[]
    
class Payment:
    id = int



class UberX(Car):
    brand=str
    model=str
    def __init__(self,license,driver,brand,model):
        super.__init__(license,driver)
        self.brand=brand
        self.model=model

class UberPool(Car):
    brand=str
    model=str
    def __init__(self,license,driver,brand,model):
        super.__init__(license,driver)
        self.brand=brand
        self.model=model

class UberBlack(Car):
    typeCaraccepted=[]
    seatsMaterial=[]

    def __init__(self,license,driver, typeCaraccepted,seatsMaterial):
        super.__init__(self,license,driver,typeCaraccepted,seatsMaterial)
        self.typeCaraccepted=typeCaraccepted
        self.seatsMaterial=seatsMaterial

class UberVan(Car):
    typeCaraccepted=[]
    seatsMaterial=[]

    def __init__(self,license,driver, typeCaraccepted,seatsMaterial):
        super.__init__(self,license,driver,typeCaraccepted,seatsMaterial)
        self.typeCaraccepted=typeCaraccepted
        self.seatsMaterial=seatsMaterial