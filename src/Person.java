class Person {
  private String name;
  private int age;
  private PetManager petManager;

  public Person() {
    this.name = null;
    this.age = 0;
    this.petManager = null;
  }

  public Person(
      String name,
      int age,
      int numbersOfPets) {
    this.name = name;
    this.age = age;
    this.petManager = new PetManager(numbersOfPets);
  }

  public boolean addPet(Pet pet) {
    return petManager.addPet(pet);
  }

  public boolean removePet(int index) {
    return petManager.removePet(index);
  }

  public String getName() {
    return this.name;
  }

  public int getAge() {
    return this.age;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public int getPetCount() {
    return this.petManager.getPetCount();
  }

  public String getPetList() {
    return this.petManager.getPetList();
  }

  public boolean updatePets(Pet pet, int index) {
    return this.petManager.updatePets(pet, index);
  }
}
