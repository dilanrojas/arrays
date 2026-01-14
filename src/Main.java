class Main {
  public static void main(String[] args) {
    Person person = new Person("Rodolfo Arias", 29, 2);

    Pet dog = new Pet("Venom", "Dog");
    Pet cat = new Pet("Mini", "Cat");

    Pet[] pets = { dog, cat };

    // Test 1: Add pets
    for (Pet p : pets) {
      if (person.addPet(p)) {
        IOManager.printMessage("Pet " + p.getPetName() + " added successfully");
      } else {
        IOManager.printMessage("Failed to add pet " + p.getPetName());
      }
    }
    System.out.println("");

    // Test 2: Print pet list using toString
    IOManager.printMessage(person.getPetList());

    // Test 3: Remove a pet using its index and print the list again
    if (person.removePet(1)) {
      IOManager.printMessage("Pet removed successfully");
    } else {
      IOManager.printMessage("Failed to remove pet");
    }
    System.out.println("");

    IOManager.printMessage(person.getPetList());

    // Test 4: Update the pet (Check if its position is right)
    if (person.updatePets(dog, 0)) {
      IOManager.printMessage("Pet " + dog.getPetName() + " updated successfully");
    } else {
      IOManager.printMessage("Pet " + dog.getPetName() + " failed to update");
    }
  }
}
