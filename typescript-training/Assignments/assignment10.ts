function maxProfit(prices: number[]): number {
    let minPrice = prices[0];
    let maxProfit = 0;

    for (let i = 1; i < prices.length; i++) {
        let currentPrice = prices[i];

        let profit = currentPrice - minPrice;

        if (profit > maxProfit) {
            maxProfit = profit;
        }

        if (currentPrice < minPrice) {
            minPrice = currentPrice;
        }
    }

    return maxProfit;
}

//calling the function
const result = maxProfit([7, 1, 5, 3, 6, 4]);
console.log(result); 
