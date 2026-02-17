/* The script is placed inside an immediately invoked function expression
   which helps protect the scope of variables */

     (function() {

     // PART ONE: CREATE HOTEL OBJECT AND WRITE OUT THE OFFER DETAILS
     
          //Write the first part here
          var hotel = {
               name: 'Park', 
               roomRate: 240,
               discount: 15,
               offerPrice: function() {
                    var offerRate = this.roomRate * ((100 - this.discount) / 100)
                    return offerRate
               }
          };


          var hotelName, roomRate, specialRate;
          hotelName = document.getElementById('hotelName');
          roomRate = document.getElementById('roomRate');
          specialRate = document.getElementById('specialRate');

          hotelName.textContent = hotel.name;
          roomRate.textContent = '$' + hotel.roomRate.toFixed(2);
          specialRate.textContent = '$' + hotel.offerPrice();
          
     // PART TWO: CALCULATE AND WRITE OUT THE EXPIRY DETAILS FOR THE OFFER

          function offerExpires(today) {

          weekFromToday = new Date(today.getTime() + 7 * 24 * 60 * 60 * 1000)

          dayNames = ['Sunday', 'Monday', 'Tuesday', 'Wednesday', 'Thursday', 'Friday', 'Saturday'];
          monthNames = ['January', 'February', 'March', 'April', 'May', 'June', 'July', 'August', 'September', 'October', 'November', 'December'];

          day = dayNames[weekFromToday.getDay()];
          date = weekFromToday.getDate();
          month = monthNames[weekFromToday.getMonth()];
          year = weekFromToday.getFullYear();

          expiryMsg = 'Offer expires next ';
          expiryMsg += day + ' <br />('+ date + ' ' + month + ' ' + year + ')';
          return expiryMsg;
     }

          today = new Date();  
          elEnds = document.getElementById('offerEnds');  // Get the offerEnds element
          elEnds.innerHTML = offerExpires(today);         // Add the expiry message
          
          // Finish the immediately invoked function expression
          }());