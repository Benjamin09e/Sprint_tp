import React, { useState } from 'react';
import './professeurs.css';
import p from '../../assets/images/professeur.png';

const Professeurs = () => {
    const [action, setAction] = useState(null);

    const handleAction = (newAction) => {
        setAction(newAction);
    };

    const getTableContent = () => {
        switch (action) {
            case 'ajouter':
                return (
                    <table className="classeTable">
                        <thead>
                            <tr>
                                <th>Nom du Professeur</th>
                                <th>Matière</th>
                            </tr>
                        </thead>
                        <tbody>
                            <tr>
                                <td>Professeur 1</td>
                                <td>Mathématiques</td>
                            </tr>
                            <tr>
                                <td>Professeur 2</td>
                                <td>Français</td>
                            </tr>
                        </tbody>
                    </table>
                );
            case 'supprimer':
                return (
                    <table className="classeTable">
                        <thead>
                            <tr>
                                <th>Nom du Professeur</th>
                                <th>Matière</th>
                                <th>Action</th>
                            </tr>
                        </thead>
                        <tbody>
                            <tr>
                                <td>Professeur 1</td>
                                <td>Mathématiques</td>
                                <td>
                                    <button>Supprimer</button>
                                </td>
                            </tr>
                            <tr>
                                <td>Professeur 2</td>
                                <td>Français</td>
                                <td>
                                    <button>Supprimer</button>
                                </td>
                            </tr>
                        </tbody>
                    </table>
                );
            case 'modifier':
                return (
                    <table className="classeTable">
                        <thead>
                            <tr>
                                <th>Nom du Professeur</th>
                                <th>Nouvelle Matière</th>
                                <th>Action</th>
                            </tr>
                        </thead>
                        <tbody>
                            <tr>
                                <td>Professeur 1</td>
                                <td>Physique</td>
                                <td>
                                    <button>Modifier</button>
                                </td>
                            </tr>
                            <tr>
                                <td>Professeur 2</td>
                                <td>Histoire</td>
                                <td>
                                    <button>Modifier</button>
                                </td>
                            </tr>
                        </tbody>
                    </table>
                );
            case 'lister':
                return (
                    <table className="classeTable">
                        <thead>
                            <tr>
                                <th>Nom du Professeur</th>
                                <th>Matière</th>
                            </tr>
                        </thead>
                        <tbody>
                            <tr>
                                <td>Professeur 1</td>
                                <td>Mathématiques</td>
                            </tr>
                            <tr>
                                <td>Professeur 2</td>
                                <td>Français</td>
                            </tr>
                        </tbody>
                    </table>
                );
            default:
                return null;
        }
    };

    return (
        <div className="content_professeurs">
            <p>Professeurs</p>
            <div className="container_professeurs">
                <div className="part_left">
                    <button onClick={() => handleAction('ajouter')}>Ajouter un Professeur</button>
                    <button onClick={() => handleAction('supprimer')}>Supprimer un Professeur</button>
                    <button onClick={() => handleAction('modifier')}>Modifier un Professeur</button>
                    <button onClick={() => handleAction('lister')}>Lister Professeurs</button>

                    {getTableContent()}
                </div>
                <div className="part_right">
                    <img src={p} alt="" width='40%' />
                </div>
            </div>
        </div>
    );
};

export default Professeurs;
