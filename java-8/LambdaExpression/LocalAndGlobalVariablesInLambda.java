package LambdaExpression;

@FunctionalInterface
interface LocalAndGlobalVariablesInLambdaInterFace {
    public void m1();
}

public class LocalAndGlobalVariablesInLambda {
    int x = 10;

    public void m2() {
        int y = 20;
        LocalAndGlobalVariablesInLambdaInterFace i = () -> {
            System.out.println(x);
            System.out.println(y);
            x = 40;
            System.out.println(x);
            //y=30;//local Variable used in lambda expression should be final or effectively final
        };
        i.m1();
    }

    public static void main(String[] args) {
        LocalAndGlobalVariablesInLambda d = new LocalAndGlobalVariablesInLambda();
        d.m2();
    }
}
