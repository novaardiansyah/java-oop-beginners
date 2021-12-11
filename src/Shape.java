class Shape {
  int getCorner() {
    return 0;
  }
}

class Rectangle extends Shape {
  int getCorner() {
    return 4;
  }

  // ? super keyword
  int getParentCorner() {
    return super.getCorner();
  }
}
