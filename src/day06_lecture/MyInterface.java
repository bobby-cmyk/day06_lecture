package day06_lecture;

@FunctionalInterface
public interface MyInterface<T> {
    
    T process (T a, T b);

}
