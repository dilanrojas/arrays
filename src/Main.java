class Main {
  public static void main(String[] args) {
    Person person = new Person("Rodolfo Arias", 29, 2);

    Pet dog = new Pet("Venom", "Dog");
    Pet cat = new Pet("Mini", "Cat");

    Pet[] pets = { dog, cat };

    for (Pet p : pets) {
      if (person.addPet(p)) {
        IOManager.printMessage("Pet " + p.getPetName() + " added successfully");
      } else {
        IOManager.printMessage("Failed to add pet " + p.getPetName());
      }
    }

    IOManager.printMessage("\nPet's array size: " + person.getPetCount());
    IOManager.printMessage(person.getPetList());

    if (person.removePet(1)) {
      IOManager.printMessage("Pet removed successfully");
    } else {
      IOManager.printMessage("Failed to remove pet");
    }

    IOManager.printMessage("\nCurrent list:\n" + person.getPetList());
  }
}
