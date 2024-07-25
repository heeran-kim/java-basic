package poly.diamond;

public interface InterfaceA {
    // Multiple inheritance of classes is not allowed due to ambiguity
    // For example, if there are two parent classes and both have methods with the same name,
    // it becomes unclear which method the child class should inherit.
    // This issue is known as the diamond problem.

    // However, implementing multiple interfaces is allowed.
    // Even if two interfaces have method with the same name, it does not cause a problem
    // because interfaces do not provide implementation for their methods.
    // All methods are implemented in the child class, eliminating ambiguity.qq

    void methodA();
    void methodCommon();
}
