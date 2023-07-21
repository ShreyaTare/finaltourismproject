
// home page Add functionality to the "Explore World" button
const exploreBtn = document.getElementById('exploreBtn');
exploreBtn.addEventListener('click', function() {
  // Replace this with your desired URL
  const url = 'https://traveltriangle.com/blog/best-places-to-visit-in-himachal-pradesh/';
  window.open(url, '_blank');
});

// Add functionality to the video button
const videoBtn = document.getElementById('videoBtn');
videoBtn.addEventListener('click', function() {
  // Replace this with your desired URL
  const url = 'https://www.youtube.com/watch?v=m6z4A2DFYU8';
  window.open(url, '_blank');
});

    //signupform

    var signupForm = document.getElementById("signup-form");
  var emailInput = document.getElementById("email-input");

  signupForm.addEventListener("submit", function(event) {
    event.preventDefault();
    var email = emailInput.value;
    
    
    emailInput.value = "";
  });


//pakg like items 



/*popup
  function handleLikeButtonClick(button) {
    if (button.classList.contains("liked")) {
      button.classList.remove("liked");
      var popup = document.createElement("div");
      popup.className = "popup";
      popup.innerHTML = "Package removed from list!";
      document.body.appendChild(popup);
      setTimeout(function() {
        popup.remove();
      }, 3000);
    } else {
      button.classList.add("liked");
      var popup = document.createElement("div");
      popup.className = "popup";
      popup.innerHTML = "Package saved to list! To see your list, click on the Saved Packages button!";
      document.body.appendChild(popup);
      setTimeout(function() {
        popup.remove();
      }, 3000);
    }
  }
  
  var likeButtons = document.getElementsByClassName("like-button");
  for (var i = 0; i < likeButtons.length; i++) {
    likeButtons[i].addEventListener("click", function() {
      handleLikeButtonClick(this);
    });
  }*/
  



  

  ///////////////////pakge button nature click//////////////


  function showNaturePackages() {
    document.getElementById("nature-packages").style.display = "block";
    document.getElementById("adventure-packages").style.display = "none";
    document.getElementById("spiritual-packages").style.display = "none";
    document.getElementById("culture-packages").style.display = "none";
    
  }
  
  function showAdventurePackages() {
    document.getElementById("nature-packages").style.display = "none";
    document.getElementById("adventure-packages").style.display = "block";
    document.getElementById("spiritual-packages").style.display = "none";
    document.getElementById("culture-packages").style.display = "none";
  }
  
  function showSpiritualPackages() {
    document.getElementById("nature-packages").style.display = "none";
    document.getElementById("adventure-packages").style.display = "none";
    document.getElementById("spiritual-packages").style.display = "block";
    document.getElementById("culture-packages").style.display = "none";
  }

  function showCulturePackages() {
    document.getElementById("nature-packages").style.display = "none";
    document.getElementById("adventure-packages").style.display = "none";
    document.getElementById("spiritual-packages").style.display = "none";
    document.getElementById("culture-packages").style.display = "block";
  }
/*
  document.addEventListener("DOMContentLoaded", function() {
    var natureAdventureButton = document.getElementById("nature-adventure-button");
    var natureAdventureContainer = document.getElementById("nature-adventure-container");
  
    natureAdventureButton.addEventListener("click", function() {
      natureAdventureContainer.style.display = "block";
    });
  });
*/



  ///////////////

  document.addEventListener("DOMContentLoaded", function() {
    var natureAdventureButton = document.getElementById("nature-adventure-button");
    var natureAdventureContainer = document.getElementById("nature-adventure-container");
    var natureAdventureImage = natureAdventureContainer.querySelector("img");
  
    natureAdventureButton.addEventListener("click", function() {
      /*natureAdventureImage.src = "<img src='resources/images/pack2ndcon.jpg'>";*/
      natureAdventureContainer.style.display = "block";
    });
  });



  
  
  var likeButtons = document.getElementsByClassName("like-button");
  for (var i = 0; i < likeButtons.length; i++) {
    likeButtons[i].addEventListener("click", function() {
      handleLikeButtonClick(this);
    });
  }
  



  /////////////Buy package fun///////////////

const buyButton = document.getElementById('buy-button-id');

function handleBuyButtonClick() {
 
  window.location.href = '\enquiry.html';
}

buyButton.addEventListener('click', handleBuyButtonClick);