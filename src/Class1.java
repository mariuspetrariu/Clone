public class Class1 implements Cloneable // shallow cloning
    {
        private ComplexClass complexClass;
        Class1(int i)
            {
                complexClass = new ComplexClass(i);
            }
        public ComplexClass getComplexClass()
            {
                return complexClass;
            }
        @Override
        protected Object clone() throws CloneNotSupportedException
            {
                return super.clone();
            }
    }
