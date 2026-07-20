class Solution {
    public int[] minOperations(String boxes) {
        int n = boxes.length();
        int[] result = new int[n];

        // Forward pass: Calculate moves from left to right
        int count = 0; // Number of balls encountered
        int operations = 0; // Cumulative moves
        for (int i = 0; i < n; i++) {
            result[i] = operations; // Store current moves in result
            count += boxes.charAt(i) - '0'; // Update ball count
            operations += count; // Add moves for next box
        }

        // Backward pass: Calculate moves from right to left
        count = 0; // Reset count
        operations = 0; // Reset operations
        for (int i = n - 1; i >= 0; i--) {
            result[i] += operations; // Add backward moves to result
            count += boxes.charAt(i) - '0'; // Update ball count
            operations += count; // Add moves for next box
        }

        return result;
    }
}
