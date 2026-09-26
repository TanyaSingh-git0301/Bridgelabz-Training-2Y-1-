package Searching;

class StringBufferVsStringBuilder {

    public static void main(String[] args) {
        int iterations = 1000000; // 1 million concatenations
        String textToAppend = "hello";

        // --- 1. Test StringBuffer Performance ---
        StringBuffer stringBuffer = new StringBuffer();
        long startTimeBuffer = System.nanoTime();

        for (int i = 0; i < iterations; i++) {
            stringBuffer.append(textToAppend);
        }

        long endTimeBuffer = System.nanoTime();
        long durationBuffer = (endTimeBuffer - startTimeBuffer) / 1000000; // Convert to milliseconds

        // --- 2. Test StringBuilder Performance ---
        StringBuilder stringBuilder = new StringBuilder();
        long startTimeBuilder = System.nanoTime();

        for (int i = 0; i < iterations; i++) {
            stringBuilder.append(textToAppend);
        }

        long endTimeBuilder = System.nanoTime();
        long durationBuilder = (endTimeBuilder - startTimeBuilder) / 1000000; // Convert to milliseconds

        // --- 3. Display Execution Results ---
        System.out.println("--- Performance Comparison (1,000,000 Concatenations) ---");
        System.out.println("Time taken by StringBuffer : " + durationBuffer + " ms");
        System.out.println("Time taken by StringBuilder: " + durationBuilder + " ms");

        System.out.println("\nConclusion: StringBuilder is faster because it does not incur thread-synchronization overhead.");
    }
}