class Pet {
  private String name;
  private String type;

  public Pet() {
    this.name = null;
    this.type = null;
  }

  public Pet(String name, String type) {
    this.name = name;
    this.type = type;
  }

  public String getPetName() {
    return this.name;
  }

  public String getType() {
    return this.type;
  }

  public void setPetName(String name) {
    this.name = name;
  }

  public void setType(String type) {
    this.type = type;
  }

  @Override
  public String toString() {
    return "[Name: " + name + "; Type: " + type + "]";
  }
}
