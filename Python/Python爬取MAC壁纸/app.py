class Point:
    def __init__(self):
        self.x = 1
        self.y = 2

    def __str__(self):
        return f"({self.x}, {self.y})"

print(str(Point()))