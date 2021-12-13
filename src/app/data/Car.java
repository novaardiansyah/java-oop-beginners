package app.data;

public interface Car extends HasBrand, IsMaintenance {
  void drive();

  int getTire();
}
