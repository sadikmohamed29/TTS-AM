async function fetchCityData(city) {
    const response = await fetch(
      `https://geocode.xyz/${city}?json=1`
    );
    const data = await response.json();
    console.log(data.latt, data.longt);
   }
   fetchCityData("Minsk");
   fetchCityData("Belgrade");