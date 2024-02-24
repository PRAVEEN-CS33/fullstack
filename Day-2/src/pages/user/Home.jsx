import React from 'react'
import image from "../../assets/images/firework_4516211.png"
import {Card} from "@mui/material"
function Home() {
  return (
    <div style={{display:"flex",justifyContent:"center",alignItems:"center",margin:"5% 4%"}}>
      {/* <div>"ParyPro" streamlines party planning with budgeting, vendor management, and guest coordination tools, empowering users to effortlessly organize events of any scale.</div> */}
      <Card style={{display:"flex",width:"80%",height:"100%"}}>
        <div style={{width:"65",padding:"2% 10%"}}>
        "ParyPro" streamlines party planning with budgeting, vendor management, and guest coordination tools,
        </div>
        <div style={{width:"33%"}}>
           <img src={image} height={"10px"}/>
        </div> 
      </Card>
    </div>
  )
}

export default Home