package app.data;

public class Category {
  private String id;
  private boolean expensive;

  public String getId() {
    return id;
  }

  public String setId(String id) {
    if (id != null) {
      return this.id = id;
    }
    return null;
  }

  public boolean isExpensive() {
    return expensive;
  }

  public boolean setExpensive(boolean expensive) {
    return this.expensive = expensive;
  }
}
