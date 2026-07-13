int maxProfit(int* prices, int pricesSize) {
    // Edge case: if there are fewer than 2 days, no transaction can be made
    if (pricesSize < 2) {
        return 0;
    }

    int min_price = prices[0];
    int max_profit = 0;

    for (int i = 1; i < pricesSize; i++) {
        // If we find a lower buying price, update min_price
        if (prices[i] < min_price) {
            min_price = prices[i];
        } 
        // Otherwise, see if selling today yields a higher profit
        else {
            int current_profit = prices[i] - min_price;
            if (current_profit > max_profit) {
                max_profit = current_profit;
            }
        }
    }

    return max_profit;
}