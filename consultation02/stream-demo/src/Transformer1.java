public class Transformer1 implements IStringTransformer{

    @Override
    public String transform(String str) {
        return "(" + str + ")";
    }

}
