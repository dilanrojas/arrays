class Main {
  public static void main(String[] args) {
    Person person = new Person("Rodolfo Arias", 29);

    Pet dog = new Pet("Venom", "Dog");
    Pet cat = new Pet("Mini", "Cat");
    Pet fish = new Pet("Nemo", "Fish");

    Pet[] pets = { dog, cat, fish };

    // Test 1: Add pets
    addPets(person, pets);
    System.out.println("");

    // Test 2: Print pet list using toString
    IOManager.printMessage(person.getList());

    // Test 3: Remove a pet using its index and print the list again
    removePet(person, 1);
    System.out.println("");

    IOManager.printMessage(person.getList());

    // Test 4: Update the pet (Check if its position is right)
    updatePet(person, dog);
  }

  public static void addPets(Person person, Pet[] pets) {
    for (Pet p : pets) {
      if (person.addPet(p)) {
        IOManager.printMessage("Pet " + p.getPetName() + " added successfully");
      } else {
        IOManager.printMessage("Failed to add pet " + p.getPetName());
      }
    }
  }

  public static void removePet(Person person, int index) {
    if (person.removePet(index)) {
      IOManager.printMessage("Pet removed successfully");
    } else {
      IOManager.printMessage("Failed to remove pet");
    }
  }

  public static void updatePet(Person person, Pet pet) {
    if (person.updatePets(pet, 0)) {
      IOManager.printMessage("Pet " + pet.getPetName() + " updated successfully");
    } else {
      IOManager.printMessage("Pet " + pet.getPetName() + " failed to update");
    }
  }
}
