class Inventory_item:

    #description, cost and stock number of Ultra coke
    def desc(self):
        return ("Only 72 times your recommended daily serving of sugar!")
    def cost(self):
        return ("$1.99")
    def stock(self):
        return ("10,000")

    # description, cost and stock number of Gucci bars
    def desc2(self):
        return ("Brand new exclusive candy from your favorite luxury brand, Gucci")
    def cost2(self):
        return ("$1.99")
    def stock2(self):
        return ("10,000")

    # description, cost and stock number of Extreme salt
    def desc3(self):
        return ("Better than regular salt because it's EXTREME")
    def cost3(self):
        return ("$10.99 per pound")
    def stock3(self):
        return ("5,000 units")

    # description, cost and stock number of Xbox One X
    def desc4(self):
        return ("It's useless!")
    def cost4(self):
        return ("$499.99")
    def stock4(self):
        return ("1337")

def main():
    invList = ['Ultra Coke', 'Gucci Bars', 'Extreme salt', 'Xbox One X']
    print(invList, '\n')
    ping = Inventory_item()

    print('Ultra coke')
    print('Description:', ping.desc())
    print('Unit Cost:', ping.cost())
    print('# of Stock:', ping.stock(), '\n')

    print('Gucci bars')
    print('Description:', ping.desc2())
    print('Unit Cost:', ping.cost2())
    print('# of Stock:', ping.stock2(), '\n')

    print('Extreme salt')
    print('Description:', ping.desc3())
    print('Unit Cost:', ping.cost3())
    print('# of Stock:', ping.stock3(), '\n')

    print('Xbox One X')
    print('Description:', ping.desc4())
    print('Unit Cost:', ping.cost4())
    print('# of Stock:', ping.stock4(), '\n')

if __name__ == '__main__':
    main()
