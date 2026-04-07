# Prototype Design Pattern (Java)

## Overview

This project demonstrates the **Prototype Design Pattern** in Java.
Instead of creating new objects from scratch, the program creates new objects by **cloning existing prototype instances**.

An `AnimalRegistry` stores prototype objects (`Sheep`, `Cow`, and `Horse`).
When a new animal is needed, the registry returns a cloned copy, which can then be customized (e.g., setting name or color).

---

## Explanation

The **Prototype Design Pattern** is a creational pattern that focuses on copying existing objects rather than instantiating new ones.

In this project:

* `Animal` is an abstract base class that defines the `clone()` method.
* `Sheep`, `Cow`, and `Horse` extend `Animal` and implement cloning using copy constructors.
* `AnimalRegistry` holds prototype objects and provides cloned instances.
* The main program (`TestAnimal`) clones objects and modifies their properties using setters.

This approach:

* Reduces repetitive object creation
* Improves performance when creating similar objects
* Promotes reuse of existing instances

---

## UML Diagram
![Image](https://github.com/eunicemabasa/Mabasa_PrototypeDesign/blob/main/Prototype%20Design%20Pattern_page-0001.jpg)

