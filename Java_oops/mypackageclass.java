//In Java, modifiers are keywords used to define access levels, behavior, or constraints for classes, methods, constructors, and variables.

//public -Accessible everywhere.
//private - Accessible only within the same class.
//protected - Accessible in the same package and subclasses
//default - Accessible only within the same package.

// | Access Level | BaseClass | Same Package | Subclass (Other Package) | Outside |
// | ------------ | --------- | ------------ | ------------------------ | ------- |
// | `public`     | ✅         | ✅            | ✅                        | ✅       |
// | `protected`  | ✅         | ✅            | ✅ (in subclass only)     | ❌       |
// | `default`    | ✅         | ✅            | ❌                        | ❌       |
// | `private`    | ✅         | ❌            | ❌                        | ❌       |


// Modifier	              Meaning
// public                 Accessible everywhere
// private	              Accessible only within the class
// protected	          Package + Subclasses
// (default)	          Package-only access
// static	              Belongs to class, not instance
// final	              Prevents modification
// abstract	              Must be overridden,doesnt have a body


// packages in java -- A package in Java is used to group related classes.Can be imported in the other java programs.
