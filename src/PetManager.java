class PetManager {
  private int petCount;
  private Pet[] petList;

  public PetManager() {
    this.petCount = 0;
    this.petList = null;
  }

  public PetManager(int numberOfPets) {
    this.petCount = 0;
    this.petList = new Pet[numberOfPets];
  }

  public boolean addPet(Pet pet) {
    if (pet == null)
      return false;

    if (petCount >= petList.length)
      return false;

    petList[petCount] = pet;
    petCount++;
    return true;
  }

  public boolean removePet(int index) {
    if (index < 0 || index >= petCount)
      return false;

    petList[index] = null;
    leftShifting(index);

    return true;
  }

  public void leftShifting(int index) {
    if (index < 0 || index >= petCount)
      return;

    for (int i = index; i < petCount - 1; i++) {
      petList[i] = petList[i + 1];
    }

    petCount--;
    petList[petCount] = null;
  }

  public int getPetCount() {
    return petCount;
  }

  public Pet[] getPets() {
    Pet[] pets = new Pet[this.petCount];

    for (int i = 0; i < this.petCount; i++) {
      pets[i] = this.petList[i];
    }

    return pets;
  }

  public String getPetList() {
    String list = "=== Pets list ===\n";

    for (Pet p : getPets()) {
      list += p.toString() + "\n";
    }

    return list;
  }

  public boolean updatePets(Pet pet, int index) {
    if (pet == null)
      return false;

    if (index < 0 || index >= petCount)
      return false;

    if (petList[index] == pet)
      return true;

    return false;
  }
}
