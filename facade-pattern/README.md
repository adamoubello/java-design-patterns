
# Facade pattern

Facade pattern prototype

## Description

The Facade Pattern defines a higher-level interface that makes the subsystem easier to use.
The Facade unifies the complex low-level interfaces of a subsystem in-order to provide a simple way to access that interface. The Facade do not encapsulate the subsystem classes or interfaces, it just provides a layer to the complex interfaces of the sub-system which makes it easier to use.

Facade vs Adapter: a Facade same as an Adapter can wrap multiple classes, but a facade is used to an interface to simplify the use of the complex interface, whereas, an adapter is used to convert the interface to an interface the client expects.

## Use

Use the Facade Pattern, when:

• You want to provide a simple interface to a complex subsystem. Subsystems often get more complex as they evolve. Most patterns, when applied, result in more and smaller classes. This makes the subsystem more reusable and easier to customize, but it also becomes harder to use for clients that don’t need to customize it. A facade can provide a simple default view of the subsystem that is good enough for most clients. Only clients needing more customizability will need to look beyond the facade.

• There are many dependencies between clients and the implementation classes of an abstraction. Introduce a facade to decouple the subsystem from clients and other subsystems, thereby promoting subsystem independence and portability.

• You can layer your subsystems. Use a facade to define an entry point to each subsystem level. If subsystems are dependent, then you can simplify the dependencies between them by making them communicate with each other solely through their facades.

## Run Locally

Clone the project

```bash
  git clone https://github.com/adamoubello/facade-pattern
```

Go to the project directory

```bash
  cd facade-pattern
```

Start the server

```bash
   Run the main class
```

## Feedback

If you have any feedback, please reach me out at adamou.bello@gmail.com


## 🚀 About Me
https://github.com/adamoubello | https://adamoubello.com/

