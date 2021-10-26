INSERT INTO CATEGORY(id, name, description) VALUES
('1', 'Phone', 'Mobile phones'),
('2', 'Air Conditioner', 'air conditioner'),
('3', 'Bat', 'Cricket bat');

INSERT INTO COLOUR(id, name) VALUES
('1', 'Green'),
('2', 'Blue'),
('3', 'Black'),
('4', 'Grey');

INSERT INTO MAKE(id, name) VALUES
('1', 'One Plus One'),
('2', 'IPhone'),

('3', 'LG'),
('4', 'Samsung'),

('5', 'MRF'),
('6', 'Britannia');

INSERT INTO SIZE(id, size, description) VALUES
('1', 'S', 'Small'),
('2', 'M', 'Medium'),
('3', 'L', 'Large'),
('4', 'XL', 'Extra Large'),

('5', '1T', 'One Ton'),
('6', '1.5T', 'One and Half Ton'),
('7', '2T', 'Two Ton'),

('8', '5', 'Five Inch'),
('9', '6', 'Five Inch'),
('10', '7', 'Five Inch');

INSERT INTO PRODUCT(name, description, categoryId, colourId, makeId, sizeId) VALUES
('onePlus 5', 'onePlus 5', 1, 1, 1, 1),
('onePlus 6', 'onePlus 5', 1, 2, 2, 2),

('LG Cool', 'LG Air conditioner', 2, 3, 3, 3),
('Hitachi zx', 'Hitachi Air conditioner', 2, 4, 4, 4),

('MRF King', 'MRF Bat', 3, 2, 5, 5),
('Britannia perform', 'Britannia perform bat', 3, 4, 6, 6);

