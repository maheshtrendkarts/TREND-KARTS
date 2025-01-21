public class product {
    <!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="Welcome to Trend Karts - Your one-stop shop for the latest trends in fashion, electronics, and more!">
    <meta name="keywords" content="Trend Karts, e-commerce, online shopping, fashion, electronics">
    <meta name="author" content="Trend Karts">
    <title>Trend Karts - Coming Soon</title>
    <link rel="stylesheet" href="styles.css">
</head>
<body>
    <header>
        <div class="logo">
    <h1>Trend Karts</h1>
        </div>
        <nav>
            <ul>
                <li><a href="#about">About Us</a></li>
                <li><a href="#contact">Contact</a></li>
                <li><a href="#subscribe">Subscribe</a></li>
                <li><a href="#products">Products</a></li>
            </ul>
        </nav>
    </header>

    <main>
        <section class="hero">
    <h2>Welcome to Trend Karts</h2>
    <p>Your one-stop shop for the latest trends in fashion, electronics, and more!</p>
            <div class="countdown">
    <h3>We are launching soon!</h3>
                <div id="timer">00:00:00</div>
            </div>
        </section>

        <section class="products" id="products">
    <h3>Our Products</h3>
            <div class="product-list">
                <div class="product-item">
                    <img src="product1.jpg" alt="Product 1">
                    <h4>Product 1</h4>
                    <p>High-quality product with great features.</p>
                    <p>Price: $99.99</p>
    <button>Add to Cart</button>
                </div>
                <div class="product-item">
                    <img src="product2.jpg" alt="Product 2">
                    <h4>Product 2</h4>
    <p>Stylish and trendy, perfect for any occasion.</p>
                    <p>Price: $79.99</p>
    <button>Add to Cart</button>
                </div>
                <div class="product-item">
                    <img src="product3.jpg" alt="Product 3">
                    <h4>Product 3</h4>
    <p>Durable and reliable for everyday use.</p>
                    <p>Price: $49.99</p>
    <button>Add to Cart</button>
                </div>
            </div>
        </section>

        <section class="subscribe" id="subscribe">
    <h3>Stay Updated</h3>
    <p>Subscribe to our newsletter to get the latest updates and exclusive offers.</p>
            <form action="#" method="post">
                <input type="email" name="email" placeholder="Enter your email" required>
                <button type="submit">Subscribe</button>
            </form>
        </section>

        <section class="social-media">
    <h3>Follow Us</h3>
            <div class="social-icons">
                <a href="#"><img src="facebook-icon.png" alt="Facebook"></a>
                <a href="#"><img src="instagram-icon.png" alt="Instagram"></a>
                <a href="#"><img src="twitter-icon.png" alt="Twitter"></a>
            </div>
        </section>
    </main>

    <footer>
        <p>&copy; 2025 Trend Karts. All Rights Reserved.</p>
    </footer>

    <script>
    // Countdown Timer Script
        const launchDate = new Date("2025-02-01T00:00:00").getTime();
        const timer = document.getElementById("timer");

        const updateTimer = () => {
            const now = new Date().getTime();
            const distance = launchDate - now;

            const days = Math.floor(distance / (1000 * 60 * 60 * 24));
            const hours = Math.floor((distance % (1000 * 60 * 60 * 24)) / (1000 * 60 * 60));
            const minutes = Math.floor((distance % (1000 * 60 * 60)) / (1000 * 60));
            const seconds = Math.floor((distance % (1000 * 60)) / 1000);

        timer.textContent = `${days}d ${hours}h ${minutes}m ${seconds}s`;

        if (distance < 0) {
            timer.textContent = "We're live now!";
        }
    };

    setInterval(updateTimer, 1000);
    </script>
</body>
</html>

}
