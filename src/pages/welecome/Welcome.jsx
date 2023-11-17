import React from 'react'
import './welcome.css'
import Navbar from '../../components/navbar/Navbar'
import Header from '../../components/header/Header'
import Classes from '../../components/classes/Classes'
import Professeurs from '../../components/professeurs/Professeurs'
import Etudiants from '../../components/etudiants/Etudiants'
import Footer from '../../components/footer/Footer'

const Welcome = () => {
    return (
        <div className="content_school">
            <div className="container_school">
                <Header />
                <Classes />
                <Professeurs />
                <Etudiants />
            </div>
        </div>
    )
}

export default Welcome