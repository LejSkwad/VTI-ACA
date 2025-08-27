package Testing_Assignment_5.Exercise3;

public class CPU {
    private String price;

    class Processor {
        private String coreAmount;
        private String menuFacturer;

        public double getCache(){
            return 4.3;
        }
    }

    class Ram {
        private String memory;
        private String menufacturer;

        public double getClockspeed(){
            return 5.5;
        }
    }

    public static void main(String[] args) {
        CPU cpu = new CPU();
        CPU.Ram ram = cpu.new Ram();
        ram.getClockspeed();
        CPU.Processor processor = cpu.new Processor();
        processor.getCache();
    }
}
