$( document ).ready(function() {
     $('.leftmenutrigger').on('click', function(e) {
     $('.side-nav').toggleClass("open");
     e.preventDefault();
    });
});

$("a.product-logout").click(function() {
	$.get("logout", function(data) {
		
		if (data !== '') {
			var customUrl = '';
			var urlContent = window.location.href.split('/'); //split ot array
			for (var i = 0; i < urlContent.length - 1; i++) {
				customUrl += urlContent[i] + '/';
			}
			customUrl += data;
			window.location = customUrl;
		}

	});
});