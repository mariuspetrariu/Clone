public class Class2 implements Cloneable // deep clone
    {
        private ComplexClass complexClass;
        Class2(int i)
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
                Class2 class2 = (Class2) super.clone();
                class2.complexClass = new ComplexClass(this.complexClass.getBoxingInteger().getInteger());
                return class2;
            }
    }
