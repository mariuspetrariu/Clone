public class ComplexClass
    {
        private BoxingInteger boxingInteger;
        ComplexClass(int i)
            {
                boxingInteger = new BoxingInteger(i);
            }
        public BoxingInteger getBoxingInteger()
            {
                return boxingInteger;
            }
    }

