import java.util.ArrayList;

class PetManager {
  private ArrayList<Pet> list;

  public PetManager() {
    this.list = new ArrayList<>();
  }

  public boolean addPet(Pet pet) {
    if (pet == null)
      return false;

    list.add(pet);
    return true;
  }

  public boolean removePet(int index) {
    if (index < 0 || index >= list.size())
      return false;

    list.remove(index);

    return true;
  }

  public int getSize() {
    return list.size();
  }

  public String getList() {
    String petList = "=== Pets list ===\n";

    for (int i = 0; i < list.size(); i++) {
      petList += list.get(i).toString() + "\n";
    }

    return petList;
  }

  public boolean updatePets(Pet pet, int index) {
    if (pet == null)
      return false;

    if (index < 0 || index >= list.size())
      return false;

    if (list.get(index) == pet)
      return true;

    return false;
  }
}
