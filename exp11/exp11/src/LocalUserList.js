import React, {useEffect, useState} from "react";

function LocalUserList(){

 const [users,setUsers]=useState([]);

 useEffect(()=>{
  fetch("/users.json")
  .then(res=>res.json())
  .then(data=>setUsers(data));
 },[]);

 return(
  <div>
   <h2>Local Users</h2>

   <ul>
    {users.map(u=>(
     <li key={u.id}>
      {u.name} - {u.email} - {u.phone}
     </li>
    ))}
   </ul>

  </div>
 );
}

export default LocalUserList;