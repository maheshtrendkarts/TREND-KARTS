<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="Explore categories on Trend Karts - Find the latest trends in fashion, electronics, and more.">
    <meta name="keywords" content="Trend Karts, categories, online shopping, fashion, electronics">
    <meta name="author" content="Trend Karts">
<title>Trend Karts - Categories</title>
    <link rel="stylesheet" href="styles.css">
    <script src="scripts.js" defer></script>
</head>
<body>
    <header>
        <div class="logo">
<h1>Trend Karts</h1>
        </div>
        <nav>
            <ul>
                <li><a href="index.html">Home</a></li>
                <li><a href="#categories">Categories</a></li>
                <li><a href="cart.html">Cart</a></li>
                <li><a href="profile.html">Account</a></li>
                <li><a href="support.html">Support</a></li>
                <li><a href="#contact">Contact</a></li>
            </ul>
        </nav>
        <div class="search-bar">
            <form action="search-results.html" method="get">
                <input type="text" name="query" id="search-input" placeholder="Search for products, categories..." required>
                <button type="submit">Search</button>
                <button type="button" id="voice-search">🎤</button>
            </form>
            <ul id="auto-suggestions" class="suggestions-list hidden"></ul>
        </div>
    </header>

    <main>
        <section class="categories" id="categories">
<h2>Shop by Categories</h2>
            <div class="category-list">
                <div class="category-item">
                    <img src="fashion.jpg" alt="Fashion">
                    <h3>Fashion</h3>
<p>Explore the latest trends in clothing and accessories.</p>
                    <a href="fashion.html" class="btn">Shop Now</a>
                </div>
                <div class="category-item">
                    <img src="electronics.jpg" alt="Electronics">
                    <h3>Electronics</h3>
<p>Discover the newest gadgets and tech accessories.</p>
                    <a href="electronics.html" class="btn">Shop Now</a>
                </div>
                <div class="category-item">
                    <img src="home-decor.jpg" alt="Home Decor">
<h3>Home Decor</h3>
<p>Enhance your living space with our unique decor items.</p>
                    <a href="home-decor.html" class="btn">Shop Now</a>
                </div>
                <div class="category-item">
                    <img src="sports.jpg" alt="Sports">
                    <h3>Sports</h3>
<p>Gear up for your favorite sports and outdoor activities.</p>
                    <a href="sports.html" class="btn">Shop Now</a>
                </div>
            </div>
        </section>

        <section class="features">
<h2>Explore More Features</h2>
            <ul>
                <li><a href="cart.html">Cart Summary, Edit Quantity, Remove Items, Apply Coupons</a></li>
                <li><a href="checkout.html">Checkout: Guest Checkout, Shipping, Payment Options</a></li>
                <li><a href="profile.html">User Account: Profile, Order History, Wishlist, Address Book</a></li>
                <li><a href="support.html">Customer Support: FAQs, Contact Us, Live Chat</a></li>
                <li><a href="blog.html">Blog: Articles, Buying Guides, Tips</a></li>
                <li><a href="about.html">About Us: History, Mission, Team</a></li>
                <li><a href="policies.html">Policies: Privacy, Terms, Shipping, Returns</a></li>
            </ul>
        </section>
    </main>

    <footer>
        <div class="footer-links">
            <div class="quick-links">
<h3>Quick Links</h3>
                <ul>
                    <li><a href="index.html">Home</a></li>
                    <li><a href="#categories">Categories</a></li>
                    <li><a href="cart.html">Cart</a></li>
                    <li><a href="profile.html">Account</a></li>
                    <li><a href="support.html">Support</a></li>
                </ul>
            </div>
            <div class="social-links">
<h3>Follow Us</h3>
                <ul>
                    <li><a href="#">Facebook</a></li>
                    <li><a href="#">Instagram</a></li>
                    <li><a href="#">Twitter</a></li>
                </ul>
            </div>
            <div class="newsletter">
                <h3>Subscribe</h3>
                <form action="#" method="post">
                    <input type="email" name="email" placeholder="Enter your email" required>
                    <button type="submit">Subscribe</button>
                </form>
            </div>
        </div>
        <p>&copy; 2025 Trend Karts. All Rights Reserved.</p>
    </footer>

    <script>
// Auto-suggestions functionality
        const searchInput = document.getElementById('search-input');
        const suggestionsList = document.getElementById('auto-suggestions');

        searchInput.addEventListener('input', () => {
        const query = searchInput.value.trim();
            if (query.length > 2) {
        // Mock suggestions
        const suggestions = ['Fashion', 'Electronics', 'Home Decor', 'Sports', 'Gadgets'];
suggestionsList.innerHTML = suggestions
        .filter(item => item.toLowerCase().includes(query.toLowerCase()))
        .map(item => `<li>${item}</li>`)
        .join('');
                suggestionsList.classList.remove('hidden');
            } else {
                    suggestionsList.classList.add('hidden');
            }
                    });

                    // Voice search functionality
                    const voiceSearchButton = document.getElementById('voice-search');
        voiceSearchButton.addEventListener('click', () => {
        if ('SpeechRecognition' in window || 'webkitSpeechRecognition' in window) {
        const SpeechRecognition = window.SpeechRecognition || window.webkitSpeechRecognition;
                const recognition = new SpeechRecognition();

recognition.onstart = () => {
        console.log('Voice recognition started');
                };

recognition.onresult = event => {
        const transcript = event.results[0][0].transcript;
searchInput.value = transcript;
                };

                        recognition.start();
            } else {
alert('Voice search is not supported in your browser.');
            }
                    });
    </script>
</body>
</html>
